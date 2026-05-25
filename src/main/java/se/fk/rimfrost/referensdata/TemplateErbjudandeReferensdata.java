package se.fk.rimfrost.template.referensdata;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.referensdata.ErbjudandeReferensdataInterface;

@ApplicationScoped
public class TemplateErbjudandeReferensdata implements ErbjudandeReferensdataInterface
{
   @Override
   public String getErbjudandeNamn(String id)
   {
      // TODO: Implement the logic needed for fetching erbjudande name in this method

      return "Erbjudande"; // TODO: Replace this static value with one associated with the provided id
   }
}
