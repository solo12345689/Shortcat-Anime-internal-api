.class final Lpa/a$b;
.super Lpa/d$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lpa/f;

.field private e:Lpa/d$b;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpa/d$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lpa/d;
    .locals 7

    .line 1
    new-instance v0, Lpa/a;

    .line 2
    .line 3
    iget-object v1, p0, Lpa/a$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lpa/a$b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lpa/a$b;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lpa/a$b;->d:Lpa/f;

    .line 10
    .line 11
    iget-object v5, p0, Lpa/a$b;->e:Lpa/d$b;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-direct/range {v0 .. v6}, Lpa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpa/f;Lpa/d$b;Lpa/a$a;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public b(Lpa/f;)Lpa/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/a$b;->d:Lpa/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lpa/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/a$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lpa/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/a$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Lpa/d$b;)Lpa/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/a$b;->e:Lpa/d$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lpa/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/a$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
