.class public final Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "LU/o0;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "fontProvider",
        "copyWithFontProvider",
        "(LU/o0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU/o0;",
        "LU0/Y0;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;",
        "typographyType",
        "modifyFontIfNeeded",
        "(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final copyWithFontProvider(LU/o0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU/o0;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "fontProvider"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, LU/o0;->e()LU0/Y0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->DISPLAY_LARGE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 20
    .line 21
    invoke-static {v1, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2}, LU/o0;->f()LU0/Y0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->DISPLAY_MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 30
    .line 31
    invoke-static {v1, v4, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v2}, LU/o0;->g()LU0/Y0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->DISPLAY_SMALL:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 40
    .line 41
    invoke-static {v1, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v2}, LU/o0;->h()LU0/Y0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->HEADLINE_LARGE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 50
    .line 51
    invoke-static {v1, v6, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v2}, LU/o0;->i()LU0/Y0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->HEADLINE_MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 60
    .line 61
    invoke-static {v1, v7, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v2}, LU/o0;->j()LU0/Y0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v8, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->HEADLINE_SMALL:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 70
    .line 71
    invoke-static {v1, v8, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v2}, LU/o0;->n()LU0/Y0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->TITLE_LARGE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 80
    .line 81
    invoke-static {v1, v9, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v2}, LU/o0;->o()LU0/Y0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget-object v10, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->TITLE_MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 90
    .line 91
    invoke-static {v1, v10, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-virtual {v2}, LU/o0;->p()LU0/Y0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v11, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->TITLE_SMALL:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 100
    .line 101
    invoke-static {v1, v11, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {v2}, LU/o0;->b()LU0/Y0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v12, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->BODY_LARGE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 110
    .line 111
    invoke-static {v1, v12, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-virtual {v2}, LU/o0;->c()LU0/Y0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v13, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->BODY_MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 120
    .line 121
    invoke-static {v1, v13, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-virtual {v2}, LU/o0;->d()LU0/Y0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->BODY_SMALL:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 130
    .line 131
    invoke-static {v1, v14, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    invoke-virtual {v2}, LU/o0;->k()LU0/Y0;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v15, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->LABEL_LARGE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 140
    .line 141
    invoke-static {v1, v15, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    invoke-virtual {v2}, LU/o0;->l()LU0/Y0;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->LABEL_MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 150
    .line 151
    invoke-static {v1, v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 152
    .line 153
    .line 154
    move-result-object v16

    .line 155
    invoke-virtual/range {p0 .. p0}, LU/o0;->m()LU0/Y0;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;->LABEL_SMALL:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;

    .line 160
    .line 161
    invoke-static {v1, v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/TypographyExtensionsKt;->modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;

    .line 162
    .line 163
    .line 164
    move-result-object v17

    .line 165
    move-object/from16 v2, p0

    .line 166
    .line 167
    invoke-virtual/range {v2 .. v17}, LU/o0;->a(LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;LU0/Y0;)LU/o0;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0
.end method

.method private static final modifyFontIfNeeded(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;->getFont(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;)LY0/u;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    if-nez v9, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const v31, 0xffffdf

    .line 13
    .line 14
    .line 15
    const/16 v32, 0x0

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const-wide/16 v11, 0x0

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const-wide/16 v16, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    const-wide/16 v23, 0x0

    .line 43
    .line 44
    const/16 v25, 0x0

    .line 45
    .line 46
    const/16 v26, 0x0

    .line 47
    .line 48
    const/16 v27, 0x0

    .line 49
    .line 50
    const/16 v28, 0x0

    .line 51
    .line 52
    const/16 v29, 0x0

    .line 53
    .line 54
    const/16 v30, 0x0

    .line 55
    .line 56
    move-object/from16 v1, p0

    .line 57
    .line 58
    invoke-static/range {v1 .. v32}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
