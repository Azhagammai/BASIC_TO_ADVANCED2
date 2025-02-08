// import numpy as np
// def Find_majority_ele(myarr):
//     n=len(myarr)
//     myarr.sort()
//     max_count = 1
//     res = myarr[0]
//     curr_count = 1
//     for i in range(1, n):
//         if (myarr[i] == myarr[i - 1]):
//             curr_count += 1
//         else:
//             curr_count = 1
//         if (curr_count > max_count):
//             max_count = curr_count
//             res = myarr[i - 1]
//     if(max_count>n/2):
//         print("The majority element is : "+str(res))
//     else:
//         print("No majority element found in the array")
// number=int(input())
// myarr = np.array([int(ele) for ele in input().split()])
// Find_majority_ele(myarr)