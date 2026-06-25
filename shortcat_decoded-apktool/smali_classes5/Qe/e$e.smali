.class public final LQe/e$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQe/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/e;->j(Lmf/N$a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LQe/e;

.field final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(LQe/e;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQe/e$e;->a:LQe/e;

    .line 2
    .line 3
    iput-object p2, p0, LQe/e$e;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(LXe/b;Lye/h0;)LQe/x$a;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQe/e$e;->a:LQe/e;

    .line 12
    .line 13
    iget-object v1, p0, LQe/e$e;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, v1}, LQe/e;->y(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
