<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <xsl:element name="ECIPackages">
            <xsl:for-each select="./Ground/Message/PFIRATED">
                <xsl:variable name="xmlMessage" select="." />
                <xsl:variable name="xmlTruncated" select="substring-after($xmlMessage,'?>')" />
                <xsl:choose>
                    <xsl:when test="$xmlTruncated">
                        <xsl:value-of select="$xmlTruncated" disable-output-escaping="yes" />
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="$xmlMessage" disable-output-escaping="yes" />
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
        </xsl:element>
    </xsl:template>
</xsl:stylesheet>