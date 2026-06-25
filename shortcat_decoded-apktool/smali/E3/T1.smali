.class public final synthetic LE3/T1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:LE3/S1$b;


# direct methods
.method public synthetic constructor <init>(LE3/S1$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/T1;->a:LE3/S1$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/T1;->a:LE3/S1$b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LE3/S1$b;->a(LE3/S1$b;Landroid/os/Message;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
