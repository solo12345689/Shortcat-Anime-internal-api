.class public final Ly4/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly4/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/d$a;,
        Ly4/d$b;,
        Ly4/d$c;
    }
.end annotation


# static fields
.field public static final e:Ly4/d$a;


# instance fields
.field private final a:J

.field private final b:Ltg/P;

.field private final c:Ltg/o;

.field private final d:Ly4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly4/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly4/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly4/d;->e:Ly4/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(JLtg/P;Ltg/o;LGf/K;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ly4/d;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Ly4/d;->b:Ltg/P;

    .line 7
    .line 8
    iput-object p4, p0, Ly4/d;->c:Ltg/o;

    .line 9
    .line 10
    new-instance v0, Ly4/b;

    .line 11
    .line 12
    invoke-virtual {p0}, Ly4/d;->getFileSystem()Ltg/o;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Ly4/d;->c()Ltg/P;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Ly4/d;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v7, 0x2

    .line 26
    move-object v3, p5

    .line 27
    invoke-direct/range {v0 .. v7}, Ly4/b;-><init>(Ltg/o;Ltg/P;LGf/K;JII)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ly4/d;->d:Ly4/b;

    .line 31
    .line 32
    return-void
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltg/k;->d:Ltg/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ltg/k$a;->g(Ljava/lang/String;)Ltg/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ltg/k;->J()Ltg/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ltg/k;->u()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ly4/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->d:Ly4/b;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ly4/d;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ly4/b;->O(Ljava/lang/String;)Ly4/b$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly4/d$b;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ly4/d$b;-><init>(Ly4/b$b;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public b(Ljava/lang/String;)Ly4/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->d:Ly4/b;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ly4/d;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ly4/b;->S(Ljava/lang/String;)Ly4/b$d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly4/d$c;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ly4/d$c;-><init>(Ly4/b$d;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public c()Ltg/P;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->b:Ltg/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ly4/d;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getFileSystem()Ltg/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->c:Ltg/o;

    .line 2
    .line 3
    return-object v0
.end method
