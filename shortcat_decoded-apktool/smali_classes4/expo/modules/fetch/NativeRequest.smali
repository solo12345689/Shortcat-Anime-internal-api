.class public final Lexpo/modules/fetch/NativeRequest;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/fetch/NativeRequest;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "LUb/d;",
        "appContext",
        "Lexpo/modules/fetch/NativeResponse;",
        "response",
        "<init>",
        "(LUb/d;Lexpo/modules/fetch/NativeResponse;)V",
        "Ldg/A;",
        "client",
        "Ljava/net/URL;",
        "url",
        "Lexpo/modules/fetch/NativeRequestInit;",
        "requestInit",
        "",
        "requestBody",
        "LTd/L;",
        "S",
        "(Ldg/A;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V",
        "J",
        "()V",
        "c",
        "Lexpo/modules/fetch/NativeResponse;",
        "O",
        "()Lexpo/modules/fetch/NativeResponse;",
        "Lexpo/modules/fetch/c;",
        "d",
        "Lexpo/modules/fetch/c;",
        "requestHolder",
        "Ldg/e;",
        "e",
        "Ldg/e;",
        "task",
        "expo_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:Lexpo/modules/fetch/NativeResponse;

.field private final d:Lexpo/modules/fetch/c;

.field private e:Ldg/e;


# direct methods
.method public constructor <init>(LUb/d;Lexpo/modules/fetch/NativeResponse;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(LUb/d;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 15
    .line 16
    new-instance p1, Lexpo/modules/fetch/c;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-direct {p1, p2}, Lexpo/modules/fetch/c;-><init>(Ldg/C;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->d:Lexpo/modules/fetch/c;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->e:Ldg/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Ldg/e;->cancel()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 10
    .line 11
    invoke-virtual {v0}, Lexpo/modules/fetch/NativeResponse;->F0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final O()Lexpo/modules/fetch/NativeResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S(Ldg/A;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V
    .locals 11

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestInit"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ldg/A;->F()Ldg/A$a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getCredentials()Lexpo/modules/fetch/NativeRequestCredentials;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lexpo/modules/fetch/NativeRequestCredentials;->INCLUDE:Lexpo/modules/fetch/NativeRequestCredentials;

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    sget-object v0, Ldg/n;->b:Ldg/n;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ldg/A$a;->g(Ldg/n;)Ldg/A$a;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lexpo/modules/fetch/NativeRequestRedirect;->FOLLOW:Lexpo/modules/fetch/NativeRequestRedirect;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ldg/A$a;->i(Z)Ldg/A$a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ldg/A$a;->j(Z)Ldg/A$a;

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1}, Ldg/A$a;->c()Ldg/A;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 53
    .line 54
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lexpo/modules/fetch/NativeResponse;->O1(Lexpo/modules/fetch/NativeRequestRedirect;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getHeaders()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, LBb/n;->a(Ljava/util/List;)Ldg/t;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "Content-Type"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v3, 0x0

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    sget-object v4, Ldg/x;->e:Ldg/x$a;

    .line 79
    .line 80
    invoke-virtual {v4, v1}, Ldg/x$a;->c(Ljava/lang/String;)Ldg/x;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v6, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move-object v6, v3

    .line 87
    :goto_0
    if-eqz p4, :cond_3

    .line 88
    .line 89
    sget-object v4, Ldg/D;->a:Ldg/D$a;

    .line 90
    .line 91
    const/4 v9, 0x6

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v5, p4

    .line 96
    invoke-static/range {v4 .. v10}, Ldg/D$a;->k(Ldg/D$a;[BLdg/x;IIILjava/lang/Object;)Ldg/D;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-nez p4, :cond_5

    .line 101
    .line 102
    :cond_3
    invoke-static {}, LBb/j;->a()[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {p4, v1}, LUd/n;->R([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    if-eqz p4, :cond_4

    .line 115
    .line 116
    sget-object v4, Ldg/D;->a:Ldg/D$a;

    .line 117
    .line 118
    const/4 p4, 0x1

    .line 119
    new-array v5, p4, [B

    .line 120
    .line 121
    aput-byte v2, v5, v2

    .line 122
    .line 123
    const/4 v9, 0x6

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    invoke-static/range {v4 .. v10}, Ldg/D$a;->k(Ldg/D$a;[BLdg/x;IIILjava/lang/Object;)Ldg/D;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :cond_4
    move-object p4, v3

    .line 132
    :cond_5
    new-instance v1, Ldg/C$a;

    .line 133
    .line 134
    invoke-direct {v1}, Ldg/C$a;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v0}, Ldg/C$a;->f(Ldg/t;)Ldg/C$a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {v0, p3, p4}, Ldg/C$a;->g(Ljava/lang/String;Ldg/D;)Ldg/C$a;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    sget-object p4, Lexpo/modules/fetch/b;->b:Lexpo/modules/fetch/b$a;

    .line 150
    .line 151
    invoke-virtual {p4, p2}, Lexpo/modules/fetch/b$a;->a(Ljava/net/URL;)Ljava/net/URL;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p3, p2}, Ldg/C$a;->n(Ljava/net/URL;)Ldg/C$a;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p2}, Ldg/C$a;->b()Ldg/C;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p3, p0, Lexpo/modules/fetch/NativeRequest;->d:Lexpo/modules/fetch/c;

    .line 164
    .line 165
    invoke-virtual {p3, p2}, Lexpo/modules/fetch/c;->a(Ldg/C;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->e:Ldg/e;

    .line 173
    .line 174
    if-eqz p1, :cond_6

    .line 175
    .line 176
    iget-object p2, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 177
    .line 178
    invoke-interface {p1, p2}, Ldg/e;->O1(Ldg/f;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget-object p1, p0, Lexpo/modules/fetch/NativeRequest;->c:Lexpo/modules/fetch/NativeResponse;

    .line 182
    .line 183
    invoke-virtual {p1}, Lexpo/modules/fetch/NativeResponse;->A1()V

    .line 184
    .line 185
    .line 186
    return-void
.end method
