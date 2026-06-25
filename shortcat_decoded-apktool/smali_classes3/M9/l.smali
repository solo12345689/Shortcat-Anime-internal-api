.class public final synthetic LM9/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:LM9/t;


# direct methods
.method public synthetic constructor <init>(LM9/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM9/l;->a:LM9/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    .line 1
    iget-object v0, p0, LM9/l;->a:LM9/t;

    .line 2
    .line 3
    invoke-static {v0}, LM9/t;->h(LM9/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
