.class final LM2/b0$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Lq2/x;

.field public final b:LF2/u$b;


# direct methods
.method private constructor <init>(Lq2/x;LF2/u$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LM2/b0$c;->a:Lq2/x;

    .line 4
    iput-object p2, p0, LM2/b0$c;->b:LF2/u$b;

    return-void
.end method

.method synthetic constructor <init>(Lq2/x;LF2/u$b;LM2/b0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/b0$c;-><init>(Lq2/x;LF2/u$b;)V

    return-void
.end method
