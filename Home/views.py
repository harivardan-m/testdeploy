from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def home_page(request):
     # return HttpResponse('hi')
     return render(request,'Home/mainhomepage.html')

def about(request):
     return render(request,'Home/aboutUs.html')

def contact(request):
     return render(request,'Home/contact.html')

def calendar(request):
     return render(request,'Home/calendar.html')

# def camtest(request):
#      import cv2
#      camera = cv2.VideoCapture(0)
#      return_value, image = camera.read()
#      cv2.imwrite('img.png', image)
#      del(camera)