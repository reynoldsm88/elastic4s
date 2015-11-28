package com.sksamuel.elastic4s

trait AggregationDsl {

  def avgAggregation(name: String): AvgAggregationDefinition = AvgAggregationDefinition(name)
  def cardinalityAggregation(name: String): CardinalityAggregationDefinition = CardinalityAggregationDefinition(name)
  def childrenAggregation(name: String): ChildrenAggregationDefinition = ChildrenAggregationDefinition(name)
  def dateHistogramAggregation(name: String): DateHistogramAggregation = DateHistogramAggregation(name)
  def dateRangeAggregation(name: String): DateRangeAggregation = DateRangeAggregation(name)
  def extendedStatsAggregation(name: String): ExtendedStatsAggregationDefinition = ExtendedStatsAggregationDefinition(name)
  def filterAggregation(name: String): FilterAggregationDefinition = FilterAggregationDefinition(name)
  def geoHashGridAggregation(name: String): GeoHashGridAggregationDefinition = GeoHashGridAggregationDefinition(name)
  def globalAggregation(name: String): GlobalAggregationDefinition = GlobalAggregationDefinition(name)
  def histogramAggregation(name: String): HistogramAggregation = HistogramAggregation(name)
  def maxAggregation(name: String): MaxAggregationDefinition = MaxAggregationDefinition(name)
  def minAggregation(name: String): MinAggregationDefinition = MinAggregationDefinition(name)
  def missingAggregation(name: String): MissingAggregationDefinition = MissingAggregationDefinition(name)
  def nestedAggregation(name: String): NestedAggregationDefinition = NestedAggregationDefinition(name)
  def percentilesAggregation(name: String): PercentilesAggregationDefinition = PercentilesAggregationDefinition(name)
  def percentileRanksAggregation(name: String): PercentileRanksAggregationDefinition = PercentileRanksAggregationDefinition(name)
  def rangeAggregation(name: String): RangeAggregationDefinition = RangeAggregationDefinition(name)
  def reverseNestedAggregation(name: String): ReverseNestedAggregationDefinition = ReverseNestedAggregationDefinition(name)
  def statsAggregation(name: String): StatsAggregationDefinition = StatsAggregationDefinition(name)
  def sumAggregation(name: String): SumAggregationDefinition = SumAggregationDefinition(name)
  def termAggregation(name: String): TermAggregationDefinition = TermAggregationDefinition(name)
  def topHitsAggregation(name: String): TopHitsAggregationDefinition = TopHitsAggregationDefinition(name)
  def valueCountAggregation(name: String): ValueCountAggregationDefinition = ValueCountAggregationDefinition(name)
}
