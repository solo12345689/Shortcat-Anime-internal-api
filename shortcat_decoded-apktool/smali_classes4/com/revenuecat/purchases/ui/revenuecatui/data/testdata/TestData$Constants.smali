.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Constants"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;",
        "",
        "<init>",
        "()V",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;",
        "images",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;",
        "getImages",
        "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;",
        "Ljava/net/URL;",
        "assetBaseURL",
        "Ljava/net/URL;",
        "getAssetBaseURL",
        "()Ljava/net/URL;",
        "",
        "",
        "zeroDecimalPlaceCountries",
        "Ljava/util/List;",
        "getZeroDecimalPlaceCountries",
        "()Ljava/util/List;",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "localization",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "getLocalization",
        "()Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "LU/l;",
        "currentColorScheme",
        "LU/l;",
        "getCurrentColorScheme",
        "()LU/l;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

.field private static final assetBaseURL:Ljava/net/URL;

.field private static final currentColorScheme:LU/l;

.field private static final images:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

.field private static final localization:Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

.field private static final zeroDecimalPlaceCountries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 62

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 7
    .line 8
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 9
    .line 10
    const-string v1, "9a17e0a7_1689854430..jpeg"

    .line 11
    .line 12
    const-string v2, "9a17e0a7_1689854342..jpg"

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->images:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 18
    .line 19
    new-instance v0, Ljava/net/URL;

    .line 20
    .line 21
    const-string v1, "https://assets.pawwalls.com"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->assetBaseURL:Ljava/net/URL;

    .line 27
    .line 28
    const-string v0, "MX"

    .line 29
    .line 30
    const-string v1, "TH"

    .line 31
    .line 32
    const-string v2, "PH"

    .line 33
    .line 34
    const-string v3, "KZ"

    .line 35
    .line 36
    const-string v4, "TW"

    .line 37
    .line 38
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->zeroDecimalPlaceCountries:Ljava/util/List;

    .line 47
    .line 48
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 49
    .line 50
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    const/16 v14, 0xc98

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    const-string v2, "Call to action for _better_ conversion."

    .line 58
    .line 59
    const-string v3, "Lorem ipsum is simply dummy text of the ~printing and~ typesetting industry."

    .line 60
    .line 61
    const-string v4, "Subscribe for {{ sub_price_per_month }}/mo"

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const-string v7, "{{ total_price_and_per_month }}"

    .line 66
    .line 67
    const-string v8, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    const-string v10, "{{ sub_period }}"

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    invoke-direct/range {v1 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    .line 76
    .line 77
    sput-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->localization:Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 78
    .line 79
    new-instance v2, LU/l;

    .line 80
    .line 81
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 82
    .line 83
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    invoke-virtual {v0}, Ls0/r0$a;->f()J

    .line 100
    .line 101
    .line 102
    move-result-wide v11

    .line 103
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 104
    .line 105
    .line 106
    move-result-wide v13

    .line 107
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 108
    .line 109
    .line 110
    move-result-wide v15

    .line 111
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 112
    .line 113
    .line 114
    move-result-wide v17

    .line 115
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 116
    .line 117
    .line 118
    move-result-wide v19

    .line 119
    invoke-virtual {v0}, Ls0/r0$a;->c()J

    .line 120
    .line 121
    .line 122
    move-result-wide v21

    .line 123
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 124
    .line 125
    .line 126
    move-result-wide v23

    .line 127
    invoke-virtual {v0}, Ls0/r0$a;->e()J

    .line 128
    .line 129
    .line 130
    move-result-wide v25

    .line 131
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 132
    .line 133
    .line 134
    move-result-wide v27

    .line 135
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 136
    .line 137
    .line 138
    move-result-wide v29

    .line 139
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 140
    .line 141
    .line 142
    move-result-wide v31

    .line 143
    invoke-virtual {v0}, Ls0/r0$a;->e()J

    .line 144
    .line 145
    .line 146
    move-result-wide v33

    .line 147
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 148
    .line 149
    .line 150
    move-result-wide v35

    .line 151
    invoke-virtual {v0}, Ls0/r0$a;->d()J

    .line 152
    .line 153
    .line 154
    move-result-wide v37

    .line 155
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 156
    .line 157
    .line 158
    move-result-wide v39

    .line 159
    invoke-virtual {v0}, Ls0/r0$a;->g()J

    .line 160
    .line 161
    .line 162
    move-result-wide v41

    .line 163
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 164
    .line 165
    .line 166
    move-result-wide v43

    .line 167
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 168
    .line 169
    .line 170
    move-result-wide v45

    .line 171
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 172
    .line 173
    .line 174
    move-result-wide v47

    .line 175
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 176
    .line 177
    .line 178
    move-result-wide v49

    .line 179
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 180
    .line 181
    .line 182
    move-result-wide v51

    .line 183
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 184
    .line 185
    .line 186
    move-result-wide v53

    .line 187
    invoke-virtual {v0}, Ls0/r0$a;->i()J

    .line 188
    .line 189
    .line 190
    move-result-wide v55

    .line 191
    invoke-virtual {v0}, Ls0/r0$a;->g()J

    .line 192
    .line 193
    .line 194
    move-result-wide v57

    .line 195
    invoke-virtual {v0}, Ls0/r0$a;->e()J

    .line 196
    .line 197
    .line 198
    move-result-wide v59

    .line 199
    const/16 v61, 0x0

    .line 200
    .line 201
    invoke-direct/range {v2 .. v61}, LU/l;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    .line 203
    .line 204
    sput-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->currentColorScheme:LU/l;

    .line 205
    .line 206
    const/16 v0, 0x8

    .line 207
    .line 208
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->$stable:I

    .line 209
    .line 210
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getAssetBaseURL()Ljava/net/URL;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->assetBaseURL:Ljava/net/URL;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentColorScheme()LU/l;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->currentColorScheme:LU/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImages()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->images:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLocalization()Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->localization:Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getZeroDecimalPlaceCountries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->zeroDecimalPlaceCountries:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
