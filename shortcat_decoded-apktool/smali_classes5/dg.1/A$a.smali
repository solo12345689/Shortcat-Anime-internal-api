.class public final Ldg/A$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:Ljg/h;

.field private a:Ldg/p;

.field private b:Ldg/k;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:Ldg/r$c;

.field private f:Z

.field private g:Ldg/b;

.field private h:Z

.field private i:Z

.field private j:Ldg/n;

.field private k:Ldg/c;

.field private l:Ldg/q;

.field private m:Ljava/net/Proxy;

.field private n:Ljava/net/ProxySelector;

.field private o:Ldg/b;

.field private p:Ljavax/net/SocketFactory;

.field private q:Ljavax/net/ssl/SSLSocketFactory;

.field private r:Ljavax/net/ssl/X509TrustManager;

.field private s:Ljava/util/List;

.field private t:Ljava/util/List;

.field private u:Ljavax/net/ssl/HostnameVerifier;

.field private v:Ldg/g;

.field private w:Lrg/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ldg/p;

    invoke-direct {v0}, Ldg/p;-><init>()V

    iput-object v0, p0, Ldg/A$a;->a:Ldg/p;

    .line 3
    new-instance v0, Ldg/k;

    invoke-direct {v0}, Ldg/k;-><init>()V

    iput-object v0, p0, Ldg/A$a;->b:Ldg/k;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldg/A$a;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldg/A$a;->d:Ljava/util/List;

    .line 6
    sget-object v0, Ldg/r;->b:Ldg/r;

    invoke-static {v0}, Lfg/e;->g(Ldg/r;)Ldg/r$c;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->e:Ldg/r$c;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldg/A$a;->f:Z

    .line 8
    sget-object v1, Ldg/b;->b:Ldg/b;

    iput-object v1, p0, Ldg/A$a;->g:Ldg/b;

    .line 9
    iput-boolean v0, p0, Ldg/A$a;->h:Z

    .line 10
    iput-boolean v0, p0, Ldg/A$a;->i:Z

    .line 11
    sget-object v0, Ldg/n;->b:Ldg/n;

    iput-object v0, p0, Ldg/A$a;->j:Ldg/n;

    .line 12
    sget-object v0, Ldg/q;->b:Ldg/q;

    iput-object v0, p0, Ldg/A$a;->l:Ldg/q;

    .line 13
    iput-object v1, p0, Ldg/A$a;->o:Ldg/b;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ldg/A$a;->p:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Ldg/A;->E:Ldg/A$b;

    invoke-virtual {v0}, Ldg/A$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ldg/A$a;->s:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Ldg/A$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->t:Ljava/util/List;

    .line 17
    sget-object v0, Lrg/d;->a:Lrg/d;

    iput-object v0, p0, Ldg/A$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Ldg/g;->d:Ldg/g;

    iput-object v0, p0, Ldg/A$a;->v:Ldg/g;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Ldg/A$a;->y:I

    .line 20
    iput v0, p0, Ldg/A$a;->z:I

    .line 21
    iput v0, p0, Ldg/A$a;->A:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Ldg/A$a;->C:J

    return-void
.end method

.method public constructor <init>(Ldg/A;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ldg/A$a;-><init>()V

    .line 24
    invoke-virtual {p1}, Ldg/A;->t()Ldg/p;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->a:Ldg/p;

    .line 25
    invoke-virtual {p1}, Ldg/A;->q()Ldg/k;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->b:Ldg/k;

    .line 26
    iget-object v0, p0, Ldg/A$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Ldg/A;->C()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 27
    iget-object v0, p0, Ldg/A$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Ldg/A;->E()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 28
    invoke-virtual {p1}, Ldg/A;->v()Ldg/r$c;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->e:Ldg/r$c;

    .line 29
    invoke-virtual {p1}, Ldg/A;->N()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A$a;->f:Z

    .line 30
    invoke-virtual {p1}, Ldg/A;->i()Ldg/b;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->g:Ldg/b;

    .line 31
    invoke-virtual {p1}, Ldg/A;->x()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A$a;->h:Z

    .line 32
    invoke-virtual {p1}, Ldg/A;->y()Z

    move-result v0

    iput-boolean v0, p0, Ldg/A$a;->i:Z

    .line 33
    invoke-virtual {p1}, Ldg/A;->s()Ldg/n;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->j:Ldg/n;

    .line 34
    invoke-virtual {p1}, Ldg/A;->j()Ldg/c;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->k:Ldg/c;

    .line 35
    invoke-virtual {p1}, Ldg/A;->u()Ldg/q;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->l:Ldg/q;

    .line 36
    invoke-virtual {p1}, Ldg/A;->J()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->m:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Ldg/A;->L()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->n:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Ldg/A;->K()Ldg/b;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->o:Ldg/b;

    .line 39
    invoke-virtual {p1}, Ldg/A;->O()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->p:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Ldg/A;->h(Ldg/A;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Ldg/A;->S()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->r:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Ldg/A;->r()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->s:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Ldg/A;->I()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->t:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Ldg/A;->B()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Ldg/A;->n()Ldg/g;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->v:Ldg/g;

    .line 46
    invoke-virtual {p1}, Ldg/A;->m()Lrg/c;

    move-result-object v0

    iput-object v0, p0, Ldg/A$a;->w:Lrg/c;

    .line 47
    invoke-virtual {p1}, Ldg/A;->k()I

    move-result v0

    iput v0, p0, Ldg/A$a;->x:I

    .line 48
    invoke-virtual {p1}, Ldg/A;->p()I

    move-result v0

    iput v0, p0, Ldg/A$a;->y:I

    .line 49
    invoke-virtual {p1}, Ldg/A;->M()I

    move-result v0

    iput v0, p0, Ldg/A$a;->z:I

    .line 50
    invoke-virtual {p1}, Ldg/A;->R()I

    move-result v0

    iput v0, p0, Ldg/A$a;->A:I

    .line 51
    invoke-virtual {p1}, Ldg/A;->H()I

    move-result v0

    iput v0, p0, Ldg/A$a;->B:I

    .line 52
    invoke-virtual {p1}, Ldg/A;->D()J

    move-result-wide v0

    iput-wide v0, p0, Ldg/A$a;->C:J

    .line 53
    invoke-virtual {p1}, Ldg/A;->A()Ljg/h;

    move-result-object p1

    iput-object p1, p0, Ldg/A$a;->D:Ljg/h;

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldg/A$a;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A$a;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final D()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->m:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Ldg/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->o:Ldg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->n:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A$a;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A$a;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final J()Ljg/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->D:Ljg/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->p:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A$a;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final N()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->r:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O(Ljava/util/List;)Ldg/A$a;
    .locals 2

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ldg/B;->g:Ldg/B;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Ldg/B;->d:Ldg/B;

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x1

    .line 65
    if-gt v0, v1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_3
    :goto_1
    sget-object v0, Ldg/B;->c:Ldg/B;

    .line 96
    .line 97
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>"

    .line 104
    .line 105
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    sget-object v1, Ldg/B;->e:Ldg/B;

    .line 116
    .line 117
    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, Ldg/A$a;->t:Ljava/util/List;

    .line 121
    .line 122
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_4

    .line 127
    .line 128
    iput-object v0, p0, Ldg/A$a;->D:Ljg/h;

    .line 129
    .line 130
    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    const-string v0, "unmodifiableList(protocolsCopy)"

    .line 135
    .line 136
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Ldg/A$a;->t:Ljava/util/List;

    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string v0, "protocols must not contain null"

    .line 145
    .line 146
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v1, "protocols must not contain http/1.0: "

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method public final P(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lfg/e;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ldg/A$a;->z:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lfg/e;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ldg/A$a;->A:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final a(Ldg/v;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/A$a;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b(Ldg/v;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/A$a;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final c()Ldg/A;
    .locals 1

    .line 1
    new-instance v0, Ldg/A;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldg/A;-><init>(Ldg/A$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ldg/c;)Ldg/A$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ldg/A$a;->k:Ldg/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lfg/e;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ldg/A$a;->x:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final f(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lfg/e;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ldg/A$a;->y:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final g(Ldg/n;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "cookieJar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/A$a;->j:Ldg/n;

    .line 7
    .line 8
    return-object p0
.end method

.method public final h(Ldg/r;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "eventListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lfg/e;->g(Ldg/r;)Ldg/r$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ldg/A$a;->e:Ldg/r$c;

    .line 11
    .line 12
    return-object p0
.end method

.method public final i(Z)Ldg/A$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldg/A$a;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(Z)Ldg/A$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldg/A$a;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Ldg/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->g:Ldg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ldg/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->k:Ldg/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A$a;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Lrg/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->w:Lrg/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ldg/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->v:Ldg/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/A$a;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Ldg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->b:Ldg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ldg/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->j:Ldg/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ldg/p;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->a:Ldg/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Ldg/q;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->l:Ldg/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ldg/r$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->e:Ldg/r$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/A$a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/A$a;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
