.class final LM2/P$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:LM2/D$b;

.field private final b:LM2/C;


# direct methods
.method private constructor <init>(LM2/D$b;LM2/C;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LM2/P$d;->a:LM2/D$b;

    .line 4
    iput-object p2, p0, LM2/P$d;->b:LM2/C;

    return-void
.end method

.method synthetic constructor <init>(LM2/D$b;LM2/C;LM2/P$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/P$d;-><init>(LM2/D$b;LM2/C;)V

    return-void
.end method

.method static synthetic a(LM2/P$d;)LM2/C;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/P$d;->b:LM2/C;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LM2/P$d;)LM2/D$b;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/P$d;->a:LM2/D$b;

    .line 2
    .line 3
    return-object p0
.end method
