<template>
    <div class="map-details-view">
        <b-row>
            <b-col cols="9">
                <Map/>
            </b-col>
            <b-col cols="3">
                <DeliveryDetails/>
            </b-col>
        </b-row>
        <b-row>
            <div style="margin-top: 30px;border-color: #006;
border-style: solid; margin-left: 15px; display: flex;">
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    background-color: rgba(0, 0, 0, 0.03);
    border-bottom: 1px solid rgba(0, 0, 0, 0.125);color: #FFF;
    font-weight: 700;
    background: #006; ">Temperature history</h1>
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    font-weight: 700;
    background: white;
border-color: #006;
border-style: solid;
">Air pressure history</h1>
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    font-weight: 700;
    background: white;
border-color: #006;
border-style: solid;
">Vibration history</h1>
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    font-weight: 700;
    background: white;
border-color: #006;
border-style: solid;
">Overload history</h1>
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    font-weight: 700;
    background: white;
border-color: #006;
border-style: solid;
">Angle</h1>
                <h1 style="    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    font-weight: 700;
    background: white;
border-color: #006;
border-style: solid;
">Absolute humidity</h1>
            </div>
            <div style=" padding-top:1px;margin-left: 15px; border-style: solid; border-width: 1.5px; border-color: #006;">
                <GChart
                        type="LineChart"
                        :data="chartData"
                        :options="chartOptions"
                />


            </div>
        </b-row>

    </div>
</template>

<script>
    import Map from "../components/Map.vue";
    import DeliveryDetails from "../components/DeliveryDetails.vue";
    import {GChart} from 'vue-google-charts';
    import axios from 'axios';


    export default {
        name: "Driver",
        components: {
            GChart,
            Map,
            DeliveryDetails
        },
        mounted() {


            axios.get(`${process.env.VUE_APP_API_URL}settings/1`)
                .then(response => {
                    this.chartData = [['field', 'Maximum value', 'Value', 'Minimum value']];
                    response.data.forEach(element => {
                        this.chartData.push(['', parseInt(element.maxValue), parseInt(element.value), parseInt(element.minValue)])
                    });

                }).catch(error => {
                console.log(error);
            });


        },
        data() {

            return {


                // Array will be automatically processed with visualization.arrayToDataTable function
                chartData: [
                    ['Year', 'Sales', 'Expenses', 'Profit'],
                    ['2014', 1000, 400, 200],
                    ['2015', 1170, 460, 250],
                    ['2016', 660, 1120, 300],
                    ['2017', 1030, 540, 350]
                ],
                chartOptions: {
                    chart: {
                        title: 'Company Performance',
                        subtitle: 'Sales, Expenses, and Profit: 2014-2017',

                    },
                    curveType: 'function',
                    width: 1140,
                    height: 300,
                    vAxis: {
                        gridlines: {
                            color: 'transparent'
                        }
                    },
                    hAxis: {
                        gridlines: {
                            color: 'transparent'
                        }
                    },
                    colors: ['#e74c3c', '#006', '#e74c3c'],
                    lineWidth: 1,

                }
            }
        }
    };


</script>
