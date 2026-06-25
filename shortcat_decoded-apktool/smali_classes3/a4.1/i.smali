.class final La4/i;
.super La4/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/String;

.field private final d:La4/j;

.field private final e:La4/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;La4/j;La4/g;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tag"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "verificationMode"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "logger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, La4/h;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La4/i;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p2, p0, La4/i;->c:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, La4/i;->d:La4/j;

    .line 29
    .line 30
    iput-object p4, p0, La4/i;->e:La4/g;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La4/h;
    .locals 6

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "condition"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La4/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance v0, La4/f;

    .line 27
    .line 28
    iget-object v1, p0, La4/i;->b:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, La4/i;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, La4/i;->e:La4/g;

    .line 33
    .line 34
    iget-object v5, p0, La4/i;->d:La4/j;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    invoke-direct/range {v0 .. v5}, La4/f;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La4/g;La4/j;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
