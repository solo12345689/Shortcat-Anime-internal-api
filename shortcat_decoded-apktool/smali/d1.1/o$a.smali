.class public final Ld1/o$a;
.super Landroidx/emoji2/text/e$f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/o;->c()LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/C0;

.field final synthetic b:Ld1/o;


# direct methods
.method constructor <init>(LY/C0;Ld1/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1/o$a;->a:LY/C0;

    .line 2
    .line 3
    iput-object p2, p0, Ld1/o$a;->b:Ld1/o;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/emoji2/text/e$f;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ld1/o$a;->b:Ld1/o;

    .line 2
    .line 3
    invoke-static {}, Ld1/s;->a()Ld1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Ld1/o;->b(Ld1/o;LY/h2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld1/o$a;->a:LY/C0;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ld1/o$a;->b:Ld1/o;

    .line 9
    .line 10
    new-instance v1, Ld1/t;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, v2}, Ld1/t;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ld1/o;->b(Ld1/o;LY/h2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
