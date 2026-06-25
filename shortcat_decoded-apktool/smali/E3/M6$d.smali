.class final LE3/M6$d;
.super Landroid/os/Binder;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/M6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:LE3/M6;


# direct methods
.method private constructor <init>(LE3/M6;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M6$d;->a:LE3/M6;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LE3/M6;LE3/M6$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE3/M6$d;-><init>(LE3/M6;)V

    return-void
.end method


# virtual methods
.method public a()LE3/M6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M6$d;->a:LE3/M6;

    .line 2
    .line 3
    return-object v0
.end method
