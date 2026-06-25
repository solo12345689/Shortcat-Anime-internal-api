.class public final Lxb/b$V;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb/b;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object p1, p1, v1

    .line 11
    .line 12
    check-cast p1, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 13
    .line 14
    check-cast v0, Lexpo/modules/kotlin/types/Either;

    .line 15
    .line 16
    const-class v2, [B

    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/types/Either;->e(Lpe/d;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/types/Either;->b(Lpe/d;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [B

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-class v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/types/Either;->c(Lpe/d;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    const/4 v2, -0x1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    move p1, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget-object v3, Lxb/b$a;->a:[I

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    aget p1, v3, p1

    .line 63
    .line 64
    :goto_0
    if-eq p1, v2, :cond_4

    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    if-eq p1, v1, :cond_3

    .line 68
    .line 69
    if-ne p1, v2, :cond_2

    .line 70
    .line 71
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "toLowerCase(...)"

    .line 78
    .line 79
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "0x"

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-static {p1, v0, v1, v2, v1}, LDf/r;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object v0, LDf/g;->d:LDf/g$b;

    .line 90
    .line 91
    invoke-virtual {v0}, LDf/g$b;->a()LDf/g;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {p1, v0}, LDf/f;->m(Ljava/lang/String;LDf/g;)[B

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    new-instance p1, LTd/r;

    .line 101
    .line 102
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_3
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_1
    new-instance v0, Lexpo/modules/crypto/aes/objects/EncryptionKey;

    .line 111
    .line 112
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, p1}, Lexpo/modules/crypto/aes/objects/EncryptionKey;-><init>([B)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    new-instance p1, Lxb/g;

    .line 120
    .line 121
    invoke-direct {p1}, Lxb/g;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxb/b$V;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
