.class public final Lv7/h;
.super Ldg/D;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ldg/D;

.field private final c:Lv7/g;

.field private d:J


# direct methods
.method public constructor <init>(Ldg/D;Lv7/g;)V
    .locals 1

    .line 1
    const-string v0, "requestBody"

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
    invoke-direct {p0}, Ldg/D;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lv7/h;->b:Ldg/D;

    .line 15
    .line 16
    iput-object p2, p0, Lv7/h;->c:Lv7/g;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic g(Lv7/h;)Lv7/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lv7/h;->c:Lv7/g;

    .line 2
    .line 3
    return-object p0
.end method

.method private final i(Ltg/i;)Ltg/X;
    .locals 2

    .line 1
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Ltg/i;->V1()Ljava/io/OutputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Lv7/h$a;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lv7/h$a;-><init>(Lv7/h;Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ltg/b;->d(Ljava/io/OutputStream;)Ltg/X;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lv7/h;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lv7/h;->b:Ldg/D;

    .line 10
    .line 11
    invoke-virtual {v0}, Ldg/D;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lv7/h;->d:J

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, Lv7/h;->d:J

    .line 18
    .line 19
    return-wide v0
.end method

.method public b()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/h;->b:Ldg/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/D;->b()Ldg/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Ltg/i;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, p1}, Lv7/h;->i(Ltg/i;)Ltg/X;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ltg/b;->a(Ltg/X;)Ltg/i;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Lv7/h;->a()J

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lv7/h;->b:Ldg/D;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ldg/D;->f(Ltg/i;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ltg/i;->flush()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[Preview unavailable]"

    .line 2
    .line 3
    return-object v0
.end method
