.class final LM2/L$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/L$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:LM2/L;


# direct methods
.method public constructor <init>(Landroid/os/Handler;LM2/L;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/L$a$a;->a:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, LM2/L$a$a;->b:LM2/L;

    .line 7
    .line 8
    return-void
.end method
