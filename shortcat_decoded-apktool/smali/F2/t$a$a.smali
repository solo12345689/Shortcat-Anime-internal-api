.class final LF2/t$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:LF2/t;


# direct methods
.method public constructor <init>(Landroid/os/Handler;LF2/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF2/t$a$a;->a:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, LF2/t$a$a;->b:LF2/t;

    .line 7
    .line 8
    return-void
.end method
