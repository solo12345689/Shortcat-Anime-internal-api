.class public final synthetic Ls4/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ls4/i;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ls4/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls4/h;->a:Ls4/i;

    .line 5
    .line 6
    iput-object p2, p0, Ls4/h;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls4/h;->a:Ls4/i;

    .line 2
    .line 3
    iget-object v1, p0, Ls4/h;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls4/i;->b(Ls4/i;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
