import sys
import requests

response = requests.get("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY")
jsonResponse = response.json()

if response.ok:
    print(jsonResponse)
else:
    print("Error!", response.status_code)
