.class public Ldg/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ldg/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/A$a;,
        Ldg/A$b;
    }
.end annotation


# static fields
.field public static final E:Ldg/A$b;

.field private static final F:Ljava/util/List;

.field private static final G:Ljava/util/List;


# instance fields
.field private final A:I

.field private final B:I

.field private final C:J

.field private final D:Ljg/h;

.field private final a:Ldg/p;

.field private final b:Ldg/k;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:Ldg/r$c;

.field private final f:Z

.field private final g:Ldg/b;

.field private final h:Z

.field private final i:Z

.field private final j:Ldg/n;

.field private final k:Ldg/c;

.field private final l:Ldg/q;

.field private final m:Ljava/net/Proxy;

.field private final n:Ljava/net/ProxySelector;

.field private final o:Ldg/b;

.field private final p:Ljavax/net/SocketFactory;

.field private final q:Ljavax/net/ssl/SSLSocketFactory;

.field private final r:Ljavax/net/ssl/X509TrustManager;

.field private final s:Ljava/util/List;

.field private final t:Ljava/util/List;

.field private final u:Ljavax/net/ssl/HostnameVerifier;

.field private final v:Ldg/g;

.field private final w:Lrg/c;

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldg/A$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldg/A$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldg/A;->E:Ldg/A$b;

    .line 8
    .line 9
    sget-object v0, Ldg/B;->f:Ldg/B;

    .line 10
    .line 11
    sget-object v1, Ldg/B;->d:Ldg/B;

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ldg/B;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lfg/e;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Ldg/A;->F:Ljava/util/List;

    .line 22
    .line 23
    sget-object v0, Ldg/l;->i:Ldg/l;

    .line 24
    .line 25
    sget-object v1, Ldg/l;->k:Ldg/l;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [Ldg/l;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lfg/e;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ldg/A;->G:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    new-instance v0, Ldg/A$a;

    invoke-direct {v0}, Ldg/A$a;-><init>()V

    invoke-direct {p0, v0}, Ldg/A;-><init>(Ldg/A$a;)V

    return-void
.end method

.method public constructor <init>(Ldg/A$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ldg/A$a;->t()Ldg/p;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->a:Ldg/p;

    .line 3
    invoke-virtual {p1}, Ldg/A$a;->q()Ldg/k;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->b:Ldg/k;

    .line 4
    invoke-virtual {p1}, Ldg/A$a;->z()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lfg/e;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->c:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Ldg/A$a;->B()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lfg/e;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->d:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Ldg/A$a;->v()Ldg/r$c;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->e:Ldg/r$c;

    .line 7
    invoke-virtual {p1}, Ldg/A$a;->I()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A;->f:Z

    .line 8
    invoke-virtual {p1}, Ldg/A$a;->k()Ldg/b;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->g:Ldg/b;

    .line 9
    invoke-virtual {p1}, Ldg/A$a;->w()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A;->h:Z

    .line 10
    invoke-virtual {p1}, Ldg/A$a;->x()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A;->i:Z

    .line 11
    invoke-virtual {p1}, Ldg/A$a;->s()Ldg/n;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->j:Ldg/n;

    .line 12
    invoke-virtual {p1}, Ldg/A$a;->l()Ldg/c;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->k:Ldg/c;

    .line 13
    invoke-virtual {p1}, Ldg/A$a;->u()Ldg/q;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->l:Ldg/q;

    .line 14
    invoke-virtual {p1}, Ldg/A$a;->E()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->m:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, Ldg/A$a;->E()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lqg/a;->a:Lqg/a;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ldg/A$a;->G()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lqg/a;->a:Lqg/a;

    .line 17
    :cond_2
    :goto_0
    iput-object v0, p0, Ldg/A;->n:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, Ldg/A$a;->F()Ldg/b;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->o:Ldg/b;

    .line 19
    invoke-virtual {p1}, Ldg/A$a;->K()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->p:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, Ldg/A$a;->r()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->s:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Ldg/A$a;->D()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ldg/A;->t:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, Ldg/A$a;->y()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Ldg/A;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, Ldg/A$a;->m()I

    move-result v1

    iput v1, p0, Ldg/A;->x:I

    .line 24
    invoke-virtual {p1}, Ldg/A$a;->p()I

    move-result v1

    iput v1, p0, Ldg/A;->y:I

    .line 25
    invoke-virtual {p1}, Ldg/A$a;->H()I

    move-result v1

    iput v1, p0, Ldg/A;->z:I

    .line 26
    invoke-virtual {p1}, Ldg/A$a;->M()I

    move-result v1

    iput v1, p0, Ldg/A;->A:I

    .line 27
    invoke-virtual {p1}, Ldg/A$a;->C()I

    move-result v1

    iput v1, p0, Ldg/A;->B:I

    .line 28
    invoke-virtual {p1}, Ldg/A$a;->A()J

    move-result-wide v1

    iput-wide v1, p0, Ldg/A;->C:J

    .line 29
    invoke-virtual {p1}, Ldg/A$a;->J()Ljg/h;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljg/h;

    invoke-direct {v1}, Ljg/h;-><init>()V

    :cond_3
    iput-object v1, p0, Ldg/A;->D:Ljg/h;

    if-eqz v0, :cond_4

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 31
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldg/l;

    .line 32
    invoke-virtual {v1}, Ldg/l;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 33
    invoke-virtual {p1}, Ldg/A$a;->L()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 34
    invoke-virtual {p1}, Ldg/A$a;->L()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 35
    invoke-virtual {p1}, Ldg/A$a;->n()Lrg/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iput-object v0, p0, Ldg/A;->w:Lrg/c;

    .line 36
    invoke-virtual {p1}, Ldg/A$a;->N()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iput-object v1, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 37
    invoke-virtual {p1}, Ldg/A$a;->o()Ldg/g;

    move-result-object p1

    .line 38
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ldg/g;->e(Lrg/c;)Ldg/g;

    move-result-object p1

    .line 39
    iput-object p1, p0, Ldg/A;->v:Ldg/g;

    goto :goto_2

    .line 40
    :cond_6
    sget-object v0, Log/j;->a:Log/j$a;

    invoke-virtual {v0}, Log/j$a;->g()Log/j;

    move-result-object v1

    invoke-virtual {v1}, Log/j;->p()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 41
    invoke-virtual {v0}, Log/j$a;->g()Log/j;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Log/j;->o(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 42
    sget-object v0, Lrg/c;->a:Lrg/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lrg/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lrg/c;

    move-result-object v0

    iput-object v0, p0, Ldg/A;->w:Lrg/c;

    .line 43
    invoke-virtual {p1}, Ldg/A$a;->o()Ldg/g;

    move-result-object p1

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ldg/g;->e(Lrg/c;)Ldg/g;

    move-result-object p1

    .line 45
    iput-object p1, p0, Ldg/A;->v:Ldg/g;

    goto :goto_2

    :cond_7
    :goto_1
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 47
    iput-object p1, p0, Ldg/A;->w:Lrg/c;

    .line 48
    iput-object p1, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 49
    sget-object p1, Ldg/g;->d:Ldg/g;

    iput-object p1, p0, Ldg/A;->v:Ldg/g;

    .line 50
    :goto_2
    invoke-direct {p0}, Ldg/A;->Q()V

    return-void
.end method

.method private final Q()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldg/A;->c:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_b

    .line 14
    .line 15
    iget-object v0, p0, Ldg/A;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-object v0, p0, Ldg/A;->s:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ldg/l;

    .line 52
    .line 53
    invoke-virtual {v1}, Ldg/l;->f()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Ldg/A;->w:Lrg/c;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "x509TrustManager == null"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "certificateChainCleaner == null"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v1, "sslSocketFactory == null"

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_5
    :goto_0
    iget-object v0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 97
    .line 98
    const-string v1, "Check failed."

    .line 99
    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    iget-object v0, p0, Ldg/A;->w:Lrg/c;

    .line 103
    .line 104
    if-nez v0, :cond_8

    .line 105
    .line 106
    iget-object v0, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, Ldg/A;->v:Ldg/g;

    .line 111
    .line 112
    sget-object v2, Ldg/g;->d:Ldg/g;

    .line 113
    .line 114
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v1, "Null network interceptor: "

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Ldg/A;->d:Ljava/util/List;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v1, "Null interceptor: "

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget-object v1, p0, Ldg/A;->c:Ljava/util/List;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1
.end method

.method public static final synthetic f()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ldg/A;->G:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ldg/A;->F:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h(Ldg/A;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()Ljg/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->D:Ljg/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldg/A;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final E()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()Ldg/A$a;
    .locals 1

    .line 1
    new-instance v0, Ldg/A$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldg/A$a;-><init>(Ldg/A;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public G(Ldg/C;Ldg/J;)Ldg/I;
    .locals 11

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lsg/d;

    .line 12
    .line 13
    sget-object v2, Lig/e;->i:Lig/e;

    .line 14
    .line 15
    new-instance v5, Ljava/util/Random;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v0, p0, Ldg/A;->B:I

    .line 21
    .line 22
    int-to-long v6, v0

    .line 23
    const/4 v8, 0x0

    .line 24
    iget-wide v9, p0, Ldg/A;->C:J

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    move-object v4, p2

    .line 28
    invoke-direct/range {v1 .. v10}, Lsg/d;-><init>(Lig/e;Ldg/C;Ldg/J;Ljava/util/Random;JLsg/e;J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lsg/d;->o(Ldg/A;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->m:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Ldg/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->o:Ldg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->n:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->p:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/A;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "CLEARTEXT-only client"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final R()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final S()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->r:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(Ldg/C;)Ldg/e;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljg/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Ljg/e;-><init>(Ldg/A;Ldg/C;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()Ldg/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->j:Ldg/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ldg/p;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->a:Ldg/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ldg/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->g:Ldg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ldg/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->k:Ldg/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lrg/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->w:Lrg/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ldg/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->v:Ldg/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Ldg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->b:Ldg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ldg/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->j:Ldg/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ldg/p;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->a:Ldg/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Ldg/q;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->l:Ldg/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ldg/r$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A;->e:Ldg/r$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A;->i:Z

    .line 2
    .line 3
    return v0
.end method
