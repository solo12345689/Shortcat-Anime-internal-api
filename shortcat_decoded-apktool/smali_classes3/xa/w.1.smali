.class public Lxa/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/w$a;
    }
.end annotation


# instance fields
.field private final a:Lxa/w$a;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Lxa/e0$b;Ljava/lang/Object;Lxa/e0$b;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxa/w$a;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3, p4}, Lxa/w$a;-><init>(Lxa/e0$b;Ljava/lang/Object;Lxa/e0$b;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxa/w;->a:Lxa/w$a;

    .line 10
    .line 11
    iput-object p2, p0, Lxa/w;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lxa/w;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public static b(Lxa/e0$b;Ljava/lang/Object;Lxa/e0$b;Ljava/lang/Object;)Lxa/w;
    .locals 1

    .line 1
    new-instance v0, Lxa/w;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lxa/w;-><init>(Lxa/e0$b;Ljava/lang/Object;Lxa/e0$b;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method a()Lxa/w$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/w;->a:Lxa/w$a;

    .line 2
    .line 3
    return-object v0
.end method
