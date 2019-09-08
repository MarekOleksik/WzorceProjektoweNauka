package homework.observator.notification;

import homework.observator.weatherforecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
