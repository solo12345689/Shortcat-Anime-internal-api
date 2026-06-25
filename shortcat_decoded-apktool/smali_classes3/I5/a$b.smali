.class LI5/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI5/a;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LI5/e;

.field final synthetic b:LI5/a;


# direct methods
.method constructor <init>(LI5/a;LI5/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI5/a$b;->b:LI5/a;

    .line 2
    .line 3
    iput-object p2, p0, LI5/a$b;->a:LI5/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LI5/a$b;->a:LI5/e;

    .line 2
    .line 3
    iget-object v1, p0, LI5/a$b;->b:LI5/a;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LI5/e;->b(LI5/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
