/*___INFO__MARK_BEGIN__*/
/*************************************************************************
 *
 *  The Contents of this file are made available subject to the terms of
 *  the Sun Industry Standards Source License Version 1.2
 *
 *  Sun Microsystems Inc., March, 2001
 *
 *
 *  Sun Industry Standards Source License Version 1.2
 *  =================================================
 *  The contents of this file are subject to the Sun Industry Standards
 *  Source License Version 1.2 (the "License"); You may not use this file
 *  except in compliance with the License. You may obtain a copy of the
 *  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html
 *
 *  Software provided under this License is provided on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
 *  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,
 *  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.
 *  See the License for the specific provisions governing your rights and
 *  obligations concerning the Software.
 *
 *   The Initial Developer of the Original Code is: Sun Microsystems, Inc.
 *
 *   Copyright: 2001 by Sun Microsystems, Inc.
 *
 *   All Rights Reserved.
 *
 ************************************************************************/
/*___INFO__MARK_END__*/
/**
 *  Generated from java_event_client.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.event;

 
/** 
 *
 */
public enum EventTypeEnum {


      /* Hostgroup events */
       HostgroupAdd,
       HostgroupDel,    
       HostgroupList,      
       HostgroupMod,

      /* SubmitHost events */
       SubmitHostAdd,
       SubmitHostDel,    
       SubmitHostList,      
       SubmitHostMod,

      /* ExecHost events */
       ExecHostAdd,
       ExecHostDel,    
       ExecHostList,      
       ExecHostMod,

      /* Manager events */
       ManagerAdd,
       ManagerDel,    
       ManagerList,      
       ManagerMod,

      /* AdvanceReservation events */
       AdvanceReservationAdd,
       AdvanceReservationDel,    
       AdvanceReservationList,      
       AdvanceReservationMod,

      /* PETask events */
       PETaskAdd,
       PETaskDel,

      /* SchedConf events */      
       SchedConfMod,

      /* Configuration events */
       ConfigurationAdd,
       ConfigurationDel,    
       ConfigurationList,      
       ConfigurationMod,

      /* Project events */
       ProjectAdd,
       ProjectDel,    
       ProjectList,      
       ProjectMod,

      /* ShareTree events */      
       ShareTreeMod,

      /* AdminHost events */
       AdminHostAdd,
       AdminHostDel,    
       AdminHostList,      
       AdminHostMod,

      /* Checkpoint events */
       CheckpointAdd,
       CheckpointDel,    
       CheckpointList,      
       CheckpointMod,

      /* ParallelEnvironment events */
       ParallelEnvironmentAdd,
       ParallelEnvironmentDel,    
       ParallelEnvironmentList,      
       ParallelEnvironmentMod,

      /* JobTask events */
       JobTaskAdd,
       JobTaskDel,      
       JobTaskMod,

      /* ComplexEntry events */
       ComplexEntryAdd,
       ComplexEntryDel,    
       ComplexEntryList,      
       ComplexEntryMod,

      /* ClusterQueue events */
       ClusterQueueAdd,
       ClusterQueueDel,    
       ClusterQueueList,      
       ClusterQueueMod,

      /* JobSchedulingInfo events */
       JobSchedulingInfoAdd,
       JobSchedulingInfoDel,    
       JobSchedulingInfoList,      
       JobSchedulingInfoMod,

      /* UserSet events */
       UserSetAdd,
       UserSetDel,    
       UserSetList,      
       UserSetMod,

      /* Calendar events */
       CalendarAdd,
       CalendarDel,    
       CalendarList,      
       CalendarMod,

      /* Operator events */
       OperatorAdd,
       OperatorDel,    
       OperatorList,      
       OperatorMod,

      /* Job events */
       JobAdd,
       JobDel,    
       JobList,      
       JobMod,

      /* QueueInstance events */
       QueueInstanceAdd,
       QueueInstanceDel,      
       QueueInstanceMod,

      /* ResourceQuotaSet events */
       ResourceQuotaSetAdd,
       ResourceQuotaSetDel,    
       ResourceQuotaSetList,      
       ResourceQuotaSetMod,

      /* User events */
       UserAdd,
       UserDel,    
       UserList,      
       UserMod,

       /* Special Events */
       QmasterGoesDown, 
       SchedulerRun, 
       Shutdown, 
       JobFinish, 
       JobUsage, 
       JobFinalUsage, 
       JobPriorityMod, 
       QueueInstanceSuspend, 
       QueueInstanceUnsuspend
}
