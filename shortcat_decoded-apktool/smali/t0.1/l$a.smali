.class public final Lt0/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt0/l$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lt0/l$a;Lt0/c;Lt0/c;I)[F
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lt0/l$a;->b(Lt0/c;Lt0/c;I)[F

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Lt0/c;Lt0/c;I)[F
    .locals 6

    .line 1
    sget-object v0, Lt0/r;->a:Lt0/r$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/r$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p3, v0}, Lt0/r;->e(II)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lt0/c;->e()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sget-object p3, Lt0/b;->a:Lt0/b$a;

    .line 20
    .line 21
    invoke-virtual {p3}, Lt0/b$a;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-static {v1, v2, v3, v4}, Lt0/b;->e(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p2}, Lt0/c;->e()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-virtual {p3}, Lt0/b$a;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-static {v2, v3, v4, v5}, Lt0/b;->e(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    if-eqz p3, :cond_1

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    if-nez v1, :cond_3

    .line 47
    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0

    .line 52
    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    move-object p1, p2

    .line 56
    :goto_1
    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"

    .line 57
    .line 58
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast p1, Lt0/F;

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Lt0/F;->F()Lt0/I;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lt0/I;->c()[F

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    goto :goto_2

    .line 74
    :cond_5
    sget-object p2, Lt0/o;->a:Lt0/o;

    .line 75
    .line 76
    invoke-virtual {p2}, Lt0/o;->c()[F

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    :goto_2
    if-eqz p3, :cond_6

    .line 81
    .line 82
    invoke-virtual {p1}, Lt0/F;->F()Lt0/I;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lt0/I;->c()[F

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    goto :goto_3

    .line 91
    :cond_6
    sget-object p1, Lt0/o;->a:Lt0/o;

    .line 92
    .line 93
    invoke-virtual {p1}, Lt0/o;->c()[F

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_3
    const/4 p3, 0x0

    .line 98
    aget v0, p2, p3

    .line 99
    .line 100
    aget v1, p1, p3

    .line 101
    .line 102
    div-float/2addr v0, v1

    .line 103
    const/4 v1, 0x1

    .line 104
    aget v2, p2, v1

    .line 105
    .line 106
    aget v3, p1, v1

    .line 107
    .line 108
    div-float/2addr v2, v3

    .line 109
    const/4 v3, 0x2

    .line 110
    aget p2, p2, v3

    .line 111
    .line 112
    aget p1, p1, v3

    .line 113
    .line 114
    div-float/2addr p2, p1

    .line 115
    const/4 p1, 0x3

    .line 116
    new-array p1, p1, [F

    .line 117
    .line 118
    aput v0, p1, p3

    .line 119
    .line 120
    aput v2, p1, v1

    .line 121
    .line 122
    aput p2, p1, v3

    .line 123
    .line 124
    return-object p1
.end method


# virtual methods
.method public final c(Lt0/c;)Lt0/l;
    .locals 2

    .line 1
    sget-object v0, Lt0/r;->a:Lt0/r$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/r$a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lt0/l$a$a;

    .line 8
    .line 9
    invoke-direct {v1, p1, v0}, Lt0/l$a$a;-><init>(Lt0/c;I)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method
