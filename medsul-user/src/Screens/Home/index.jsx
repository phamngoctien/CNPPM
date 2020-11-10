import React, { Component } from 'react';
import Carousel01 from '../../Assets/banner1.png';
import Carousel02 from '../../Assets/banner2.png';
import Carousel03 from '../../Assets/banner3.jpg';
import './styles.css';
import { connect } from 'react-redux';
import ServiceScreens from '../Service';
class HomeScreen extends Component {
    render() {
        return (
            <div>
                {this.props.isShowComponentService ? <ServiceScreens /> : <div id="carouselExampleFade" className="carousel slide carousel-fade" data-ride="carousel">
                    <ol className="carousel-indicators">
                        <li data-target="#carouselExampleCaptions" data-slide-to={0} className="active" />
                        <li data-target="#carouselExampleCaptions" data-slide-to={1} />
                        <li data-target="#carouselExampleCaptions" data-slide-to={2} />
                    </ol>

                    <div className="carousel-inner">
                        <div className="carousel-item active">
                            <img src={Carousel01} className="d-block w-100" alt="..." />
                            <div className="carousel-caption text-dark d-none d-md-block">

                            </div>

                        </div>
                        <div className="carousel-item">
                            <img src={Carousel02} className="d-block w-100" alt="..." />
                            <div className="carousel-caption text-dark d-none d-md-block">

                            </div>
                        </div>
                        <div className="carousel-item">
                            <img src={Carousel03} className="d-block w-100" alt="..." />
                            <div className="carousel-caption text-dark d-none d-md-block">

                            </div>
                        </div>
                    </div>
                    <a className="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
                        <span className="carousel-control-prev-icon" aria-hidden="true" />
                        <span className="sr-only">Previous</span>
                    </a>
                    <a className="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
                        <span className="carousel-control-next-icon" aria-hidden="true" />
                        <span className="sr-only">Next</span>
                    </a>
                </div>}
            </div>
        );
    }
}
const mapStateToProps = state => ({
    isShowComponentService: state.service.componentService.isShow
})
export default connect(mapStateToProps)(HomeScreen);