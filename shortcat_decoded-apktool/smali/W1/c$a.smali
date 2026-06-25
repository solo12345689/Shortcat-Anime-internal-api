.class final LW1/c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW1/c;->d(Landroid/content/Context;Lpe/m;)LT1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:LW1/c;


# direct methods
.method constructor <init>(Landroid/content/Context;LW1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW1/c$a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, LW1/c$a;->b:LW1/c;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/io/File;
    .locals 2

    .line 2
    iget-object v0, p0, LW1/c$a;->a:Landroid/content/Context;

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LW1/c$a;->b:LW1/c;

    invoke-static {v1}, LW1/c;->c(LW1/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LW1/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LW1/c$a;->invoke()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
