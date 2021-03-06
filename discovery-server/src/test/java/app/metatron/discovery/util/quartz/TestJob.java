/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.util.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by kyungtaak on 2016. 8. 11..
 */
public class TestJob implements Job {

  public TestJob() {
  }

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    Object obj = jobExecutionContext.getJobDetail().getJobDataMap().get("test");
    System.out.println("TEST JOB : " + jobExecutionContext.getJobInstance().toString() + " " + obj);
  }
}
