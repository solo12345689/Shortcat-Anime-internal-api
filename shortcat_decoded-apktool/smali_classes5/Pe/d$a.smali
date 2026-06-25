.class final LPe/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Luf/i;

.field private final b:LHe/E;

.field private final c:Luf/q;


# direct methods
.method public constructor <init>(Luf/i;LHe/E;Luf/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LPe/d$a;->a:Luf/i;

    .line 5
    .line 6
    iput-object p2, p0, LPe/d$a;->b:LHe/E;

    .line 7
    .line 8
    iput-object p3, p0, LPe/d$a;->c:Luf/q;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()LHe/E;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/d$a;->b:LHe/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Luf/i;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/d$a;->a:Luf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Luf/q;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/d$a;->c:Luf/q;

    .line 2
    .line 3
    return-object v0
.end method
