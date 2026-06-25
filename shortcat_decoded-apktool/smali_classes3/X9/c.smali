.class public final synthetic LX9/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lma/b;


# instance fields
.field public final synthetic a:LX9/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(LX9/e;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX9/c;->a:LX9/e;

    .line 5
    .line 6
    iput-object p2, p0, LX9/c;->b:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LX9/c;->a:LX9/e;

    .line 2
    .line 3
    iget-object v1, p0, LX9/c;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0, v1}, LX9/e;->b(LX9/e;Landroid/content/Context;)Lra/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
