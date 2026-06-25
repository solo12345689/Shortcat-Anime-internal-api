.class public final LBd/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LBd/c;


# instance fields
.field private final a:Lexpo/modules/updates/d;


# direct methods
.method public constructor <init>(Lexpo/modules/updates/d;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LBd/d;->a:Lexpo/modules/updates/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, LBd/g;->a:LBd/g;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p3}, LBd/g;->a(Lrd/d;Lorg/json/JSONObject;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    const/4 v2, 0x1

    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    return v2

    .line 18
    :cond_2
    invoke-virtual {v1, p2, p3}, LBd/g;->a(Lrd/d;Lorg/json/JSONObject;)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_3

    .line 23
    .line 24
    return v2

    .line 25
    :cond_3
    invoke-virtual {p1}, Lrd/d;->o()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-eqz p3, :cond_4

    .line 30
    .line 31
    invoke-virtual {p1}, Lrd/d;->o()Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    iget-object v1, p0, LBd/d;->a:Lexpo/modules/updates/d;

    .line 36
    .line 37
    invoke-virtual {v1}, Lexpo/modules/updates/d;->t()Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-nez p3, :cond_4

    .line 46
    .line 47
    return v0

    .line 48
    :cond_4
    invoke-virtual {p1}, Lrd/d;->j()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    if-eqz p3, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1}, Lrd/d;->j()Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    iget-object v1, p0, LBd/d;->a:Lexpo/modules/updates/d;

    .line 59
    .line 60
    invoke-virtual {v1}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_5

    .line 69
    .line 70
    return v0

    .line 71
    :cond_5
    invoke-virtual {p2}, Lrd/d;->o()Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    if-eqz p3, :cond_6

    .line 76
    .line 77
    invoke-virtual {p2}, Lrd/d;->o()Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    iget-object v0, p0, LBd/d;->a:Lexpo/modules/updates/d;

    .line 82
    .line 83
    invoke-virtual {v0}, Lexpo/modules/updates/d;->t()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-nez p3, :cond_6

    .line 92
    .line 93
    return v2

    .line 94
    :cond_6
    invoke-virtual {p2}, Lrd/d;->j()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    if-eqz p3, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2}, Lrd/d;->j()Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    iget-object v0, p0, LBd/d;->a:Lexpo/modules/updates/d;

    .line 105
    .line 106
    invoke-virtual {v0}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-nez p3, :cond_7

    .line 115
    .line 116
    return v2

    .line 117
    :cond_7
    invoke-virtual {p1}, Lrd/d;->b()Ljava/util/Date;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p2}, Lrd/d;->b()Ljava/util/Date;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p1, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    return p1
.end method

.method public b(Lwd/u$c;Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z
    .locals 1

    .line 1
    const-string v0, "directive"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "embeddedUpdate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LBd/g;->a:LBd/g;

    .line 12
    .line 13
    invoke-virtual {v0, p2, p4}, LBd/g;->a(Lrd/d;Lorg/json/JSONObject;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p2, 0x1

    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    return p2

    .line 25
    :cond_1
    invoke-virtual {v0, p3, p4}, LBd/g;->a(Lrd/d;Lorg/json/JSONObject;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-nez p4, :cond_2

    .line 30
    .line 31
    return p2

    .line 32
    :cond_2
    invoke-virtual {p1}, Lwd/u$c;->b()Ljava/util/Date;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p3}, Lrd/d;->b()Ljava/util/Date;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
.end method
