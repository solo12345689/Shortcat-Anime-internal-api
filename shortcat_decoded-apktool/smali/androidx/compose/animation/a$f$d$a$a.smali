.class public final Landroidx/compose/animation/a$f$d$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$d$a;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/E;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;


# direct methods
.method public constructor <init>(Li0/E;Ljava/lang/Object;Landroidx/compose/animation/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/a$f$d$a$a;->a:Li0/E;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/a$f$d$a$a;->c:Landroidx/compose/animation/e;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a$a;->a:Li0/E;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a$a;->c:Landroidx/compose/animation/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/animation/e;->h()Lt/P;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lt/P;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
