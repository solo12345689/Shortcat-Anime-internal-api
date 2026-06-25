.class public final Lv7/i;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ldg/F;

.field private final c:Lv7/g;

.field private d:Ltg/j;

.field private e:J


# direct methods
.method public constructor <init>(Ldg/F;Lv7/g;)V
    .locals 1

    .line 1
    const-string v0, "responseBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "progressListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lv7/i;->b:Ldg/F;

    .line 15
    .line 16
    iput-object p2, p0, Lv7/i;->c:Lv7/g;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic m(Lv7/i;)Lv7/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lv7/i;->c:Lv7/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lv7/i;)Ldg/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lv7/i;->b:Ldg/F;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lv7/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv7/i;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic w(Lv7/i;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lv7/i;->e:J

    .line 2
    .line 3
    return-void
.end method

.method private final z(Ltg/Z;)Ltg/Z;
    .locals 1

    .line 1
    new-instance v0, Lv7/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lv7/i$a;-><init>(Ltg/Z;Lv7/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv7/i;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/i;->b:Ldg/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/F;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public j()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/i;->b:Ldg/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()Ltg/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/i;->d:Ltg/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lv7/i;->b:Ldg/F;

    .line 10
    .line 11
    invoke-virtual {v1}, Ldg/F;->k()Ltg/j;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {p0, v1}, Lv7/i;->z(Ltg/Z;)Ltg/Z;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ltg/b;->b(Ltg/Z;)Ltg/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lv7/i;->d:Ltg/j;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lv7/i;->d:Ltg/j;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "bufferedSource"

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :cond_1
    return-object v0
.end method
