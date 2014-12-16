
//PCE collection
db.pces.insert( 
	[
		{ "_id": 5695930304, "desc": "Systolic Blood Pressure (Observable Entity) + Procedure on upper arm + Right upper arm structure (body structure)" }, 
		{ "_id": 5695930307, "desc": "Diastolic Blood Pressure (Observable Entity) + Procedure on upper arm + Right upper arm structure (body structure)" }, 
		{ "_id": 5695930310, "desc": "Systolic Blood Pressure (Observable Entity) + Procedure on upper arm + Left upper arm structure (body structure)" }, 
		{ "_id": 5695930313, "desc": "Diastolic Blood Pressure (Observable Entity) + Procedure on upper arm + Left upper arm structure (body structure)" },
		
		{ "_id": 5695444313, "desc": "Diastolic Blood Pressure (Observable Entity)" },
		{ "_id": 5695444314, "desc": "Procedure on upper arm" },
		{ "_id": 5695444315, "desc": "Left upper arm structure (body structure)" },
		{ "_id": 5695444316, "desc": "Right upper arm structure (body structure)" },
		{ "_id": 5695930315, "desc": "Systolic Blood Pressure (Observable Entity)" }

	]
);

// Patient collection
db.patients.insert( 
	[
		{ "_id": 10000001, first_name:"Diann", middle_name:"Agnese", last_name:"Ayers", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000002, first_name:"Annalee", middle_name:"Marlee", last_name:"Coleman", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000003, first_name:"Victor", middle_name:"Menahem", last_name:"Lemmi", dob:new Date("04/15/1955"), gender:2, race:1 }, 
		{ "_id": 10000004, first_name:"Christi", middle_name:"Battista", last_name:"Tobin", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000005, first_name:"Kerrie", middle_name:"Gottlob", last_name:"Fiscella", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000006, first_name:"", middle_name:"", last_name:"", dob:new Date("04/15/1955"), gender:2, race:1 },
		{ "_id": 10000007, first_name:"Nina", middle_name:"Audie", last_name:"Breckenridge", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000008, first_name:"Dollie", middle_name:"Jennie", last_name:"Barnes", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000009, first_name:"Tayla", middle_name:"Casey", last_name:"Geiger", dob:new Date("04/15/1955"), gender:1, race:1 }, 
		{ "_id": 10000010, first_name:"Jeanne", middle_name:"Ovidio", last_name:"Morrison", dob:new Date("04/15/1955"), gender:1, race:2 }, 
		{ "_id": 10000011, first_name:"Romano", middle_name:"Horatio", last_name:"Wash", dob:new Date("04/15/1955"), gender:2, race:1 }, 	
		{ "_id": 10000012, first_name:"Anthony", last_name:"Campo", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000013, first_name:"Zion", middle_name:"Jaki", last_name:"Ridley", dob:new Date("04/15/1955"), gender:2, race:4 },
		{ "_id": 10000014, first_name:"Jonathon", last_name:"Colbert", dob:new Date("04/15/1955"), gender:2, race:1 },
		{ "_id": 10000015, first_name:"Kimberly", middle_name:"Vivyan", last_name:"Vipond", dob:new Date("04/15/1955"), gender:1, race:4 },
		{ "_id": 10000016, first_name:"Fanny", middle_name:"Sadb", last_name:"Altimari", dob:new Date("04/15/1955"), gender:1, race:3 },
		{ "_id": 10000017, first_name:"Guy", middle_name:"", last_name:"", dob:new Date("04/15/1955"), gender:2, race:2 },
		{ "_id": 10000018, first_name:"Hannah", middle_name:"Conall", last_name:"Peterson", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000019, first_name:"Clarissa", middle_name:"Dorothea", last_name:"Fay", dob:new Date("04/15/1955"), gender:1, race:5 },
		{ "_id": 10000020, first_name:"Liberty", middle_name:"Vinzent", last_name:"Coel", dob:new Date("04/15/1955"), gender:1, race:2 },
		{ "_id": 10000021, first_name:"Roscoe", middle_name:"", last_name:"Franklin", dob:new Date("04/15/1955"), gender:2, race:1 },	
		{ "_id": 10000022, first_name:"Faye", middle_name:"Wilmer", last_name:"Sexton", dob:new Date("04/15/1955"), gender:1, race:5 },
		{ "_id": 10000023, first_name:"Sergio", middle_name:"Kalyn", last_name:"Allard", dob:new Date("04/15/1955"), gender:2, race:4 },
		{ "_id": 10000024, first_name:"Adelina", middle_name:"Sheldon", last_name:"Tirrell", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000025, first_name:"Lanny", middle_name:"Michela", last_name:"McNaughton", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000026, first_name:"Matteo", middle_name:"Henrike", last_name:"Brennan", dob:new Date("04/15/1955"), gender:2, race:2 },
		{ "_id": 10000027, first_name:"Richard", middle_name:"Demetrio", last_name:"Jernigan", dob:new Date("04/15/1955"), gender:2, race:3 },
		{ "_id": 10000028, first_name:"Melany", middle_name:"Chanel", last_name:"Durant", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000029, first_name:"Christine", middle_name:"Karl", last_name:"Haley", dob:new Date("04/15/1955"), gender:1, race:2 },
		{ "_id": 10000030, first_name:"Claudia", middle_name:"Alannah", last_name:"Connell", dob:new Date("04/15/1955"), gender:1, race:3 },
		{ "_id": 10000031, first_name:"Billie", middle_name:"Brad", last_name:"Pisani", dob:new Date("04/15/1955"), gender:2, race:1 },
		{ "_id": 10000032, first_name:"Lorena", middle_name:"Bridger", last_name:"Jack", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000033, first_name:"Elisabeth", middle_name:"Sesto", last_name:"Trudu", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000034, first_name:"Lacy", middle_name:"Lori", last_name:"McNeil", dob:new Date("04/15/1955"), gender:1, race:2 },
		{ "_id": 10000035, first_name:"Rodolphe", middle_name:"Giustino", last_name:"Underwood", dob:new Date("04/15/1955"), gender:2, race:2 },
		{ "_id": 10000036, first_name:"Karen", middle_name:"Aniya", last_name:"Quinn", dob:new Date("04/15/1955"), gender:1, race:2 },
		{ "_id": 10000037, first_name:"Jacquelyn", middle_name:"Quirin", last_name:"Milford", dob:new Date("04/15/1955"), gender:1, race:2 },
		{ "_id": 10000038, first_name:"Konnor", middle_name:"Markus", last_name:"Riese", dob:new Date("04/15/1955"), gender:2, race:1 },
		{ "_id": 10000039, first_name:"Sharyn", middle_name:"Martha", last_name:"Appleby", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000040, first_name:"Detta", middle_name:"Ronda", last_name:"Marchetti", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000041, first_name:"Arlene", middle_name:"Dell", last_name:"Thorley", dob:new Date("04/15/1955"), gender:1, race:3 },
		{ "_id": 10000042, first_name:"Sheila", middle_name:"Moritz", last_name:"Bray", dob:new Date("04/15/1955"), gender:1, race:3 },
		{ "_id": 10000043, first_name:"Crispin", middle_name:"Bret", last_name:"Summers", dob:new Date("04/15/1955"), gender:2, race:2 },
		{ "_id": 10000044, first_name:"Etta", middle_name:"Ziska", last_name:"Thacker", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000045, first_name:"Antonina", middle_name:"Donatien", last_name:"Walter", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000046, first_name:"Mathew", middle_name:"Franklin", last_name:"Fairchild", dob:new Date("04/15/1955"), gender:2, race:1 },
		{ "_id": 10000047, first_name:"Chevonne", middle_name:"Bertrand", last_name:"Northrop", dob:new Date("04/15/1955"), gender:1, race:1 },
		{ "_id": 10000048, first_name:"Leopold", middle_name:"Nia", last_name:"Duff", dob:new Date("04/15/1955"), gender:2, race:1 }
	]
);

// Encounter collection
db.encounters.insert( 
	[
		{ "_id": 3049593923, "patient_id":	10000001, "date": "6-29-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 100, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593924, "patient_id":	10000002, "date": "1-17-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 154, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593925, "patient_id":	10000003, "date": "12-2-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 122, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593926, "patient_id":	10000004, "date": "2-18-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 114, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593927, "patient_id":	10000005, "date": "3-30-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 98, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593928, "patient_id":	10000006, "date": "2-5-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 124, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593929, "patient_id":	10000007, "date": "6-27-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 126, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593930, "patient_id":	10000008, "date": "1-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 152, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593931, "patient_id":	10000009, "date": "3-31-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 111, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593932, "patient_id":	10000010, "date": "5-6-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 101, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593933, "patient_id":	10000011, "date": "1-12-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593934, "patient_id":	10000012, "date": "12-1-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 104, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593935, "patient_id":	10000013, "date": "11-25-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 124, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593936, "patient_id":	10000014, "date": "1-16-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 122, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""},
			{ name: 5695930310, name_type: 1, value: 125, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593937, "patient_id":	10000015, "date": "4-16-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 116, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593938, "patient_id":	10000016, "date": "2-19-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593939, "patient_id":	10000017, "date": "1-30-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 146, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593940, "patient_id":	10000018, "date": "2-6-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 120, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593941, "patient_id":	10000019, "date": "12-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 110, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593942, "patient_id":	10000020, "date": "5-30-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 111, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593943, "patient_id":	10000021, "date": "4-22-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 112, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593944, "patient_id":	10000022, "date": "12-3-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 101, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593945, "patient_id":	10000023, "date": "6-26-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 100, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593946, "patient_id":	10000024, "date": "10-18-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 115, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593947, "patient_id":	10000025, "date": "6-4-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 112, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593948, "patient_id":	10000026, "date": "6-24-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593949, "patient_id":	10000027, "date": "6-10-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 104, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593950, "patient_id":	10000028, "date": "3-12-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 103, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593951, "patient_id":	10000029, "date": "12-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 114, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593952, "patient_id":	10000030, "date": "1-29-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 155, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593953, "patient_id":	10000031, "date": "1-6-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 144, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593954, "patient_id":	10000032, "date": "12-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 133, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593955, "patient_id":	10000033, "date": "6-30-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 112, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593956, "patient_id":	10000034, "date": "5-20-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593957, "patient_id":	10000035, "date": "11-26-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 104, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593958, "patient_id":	10000036, "date": "8-26-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 106, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593959, "patient_id":	10000037, "date": "12-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 122, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593960, "patient_id":	10000038, "date": "11-5-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593961, "patient_id":	10000039, "date": "1-4-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 112, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593962, "patient_id":	10000040, "date": "10-31-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 165, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593963, "patient_id":	10000041, "date": "6-10-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 122, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593964, "patient_id":	10000042, "date": "1-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 112, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593965, "patient_id":	10000043, "date": "7-3-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 105, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593966, "patient_id":	10000044, "date": "5-20-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 115, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593967, "patient_id":	10000045, "date": "12-8-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 100, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593968, "patient_id":	10000046, "date": "5-28-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 102, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593969, "patient_id":	10000047, "date": "4-21-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 94, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] },
		{ "_id": 3049593970, "patient_id":	10000048, "date": "6-15-2014", type:4, reason_for_visit:"", observations:[
			{ name: 5695930304, name_type: 1, value: 84, value_type: 2, applies:"", issued:new Date(), identifier:"", subject:""}
		] }
	]	
);