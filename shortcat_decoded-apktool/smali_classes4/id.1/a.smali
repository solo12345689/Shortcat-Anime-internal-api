.class public Lid/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lid/g;


# static fields
.field private static final c:Lid/a;

.field private static final d:Lid/a;


# instance fields
.field private final a:Z

.field private final b:Lid/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lid/a;

    .line 2
    .line 3
    sget-object v1, Lid/k;->b:Lid/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v2, v1}, Lid/a;-><init>(ZLid/k;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lid/a;->c:Lid/a;

    .line 10
    .line 11
    new-instance v0, Lid/a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v1}, Lid/a;-><init>(ZLid/k;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lid/a;->d:Lid/a;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(ZLid/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lid/a;->a:Z

    .line 5
    .line 6
    const-string p1, "params must not be null"

    .line 7
    .line 8
    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lid/a;->b:Lid/k;

    .line 12
    .line 13
    return-void
.end method

.method public static e(Z)Lid/a;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lid/a;->c:Lid/a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lid/a;->d:Lid/a;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public a()Lid/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lid/a;->b:Lid/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lid/k;)Lid/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lid/a;->f(Lid/k;)Lid/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lid/a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "?1"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "?0"

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lid/a;->b:Lid/k;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lid/k;->o(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public d()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lid/a;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Lid/k;)Lid/a;
    .locals 2

    .line 1
    const-string v0, "params must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lid/k;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lid/a;

    .line 14
    .line 15
    iget-boolean v1, p0, Lid/a;->a:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, p1}, Lid/a;-><init>(ZLid/k;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lid/a;->d()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
