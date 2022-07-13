let students =
[
{name: "zareen",
 marks: 60,
 gender: "female"
},
{name: "zia",
 marks: 70,
 gender: "male"
},
{name: "Nusaiba",
 marks: 90,
 gender: "female"
},
{name: "Nizam",
 marks: 60,
 gender: "female"
},
{name: "Nipa",
 marks: 60,
 gender: "female"
},
{name: "Howladar",
 marks: 90,
 gender: "male"
}
]
let i=0;
students.filter(student => student.marks>=60 && student.marks<=70).forEach(student=> console.log("Students in between 60 to 70:",student));

let male=students.filter(student => student.marks>=60 && student.marks<=70&&student.gender==='male')
.reduce((i=>i=i+1),0);
console.log("Number of male student" , male);

let female=students.filter(student => student.marks>=60 && student.marks<=70&&student.gender==='female')
.reduce((i=>i=i+1),0);
console.log("Number of female student" , female);
