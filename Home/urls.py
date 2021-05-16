from django.urls import path,include
from . import views
app_name='Home'
urlpatterns = [
path('',views.home_page,name='home'),
path('about/',views.about,name='about'),
path('contact/',views.contact,name='contact'),
path('calendar/',views.calendar,name='calendar'),
# path('camtest/',views.camtest,name='camtest')
]