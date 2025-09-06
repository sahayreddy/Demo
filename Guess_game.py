import random
def randomnumber():
    secret_number=random.randint(1,10)
    guess=0
    count=0
    while guess != secret_number:      
        guess=int(input("Enter the number"))
        if guess < secret_number:
            print("Number too low")
        elif guess == secret_number:
            print("The Number is ",secret_number)
        else:
            print("The number you choose is too high")
        count+=1
        if count==5 :
            print("Your chances are over ")
            break
    
answer=input("Do you want to play the game again")
if answer=="yes":
    randomnumber()
else:
    print("Okay")
