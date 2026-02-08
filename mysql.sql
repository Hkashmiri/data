#delete from  pas.Assess where assessment_id=1;
insert into pas.EvalDeployment (assessment_id, assessor_id, group_id, deployment_id)
	values (1, 2, 1, uuid());
SELECT * FROM pas.EvalDeployment;

#{{assessed_student_id: 1,
#assessor_student_id: 2,
#assessment_id: 1,
#scale_id: 1

