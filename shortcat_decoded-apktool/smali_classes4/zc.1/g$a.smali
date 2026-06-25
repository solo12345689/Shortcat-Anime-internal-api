.class final Lzc/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lzc/g;


# direct methods
.method constructor <init>(Lzc/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzc/g$a;->a:Lzc/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lzc/g$a;->a:Lzc/g;

    .line 2
    .line 3
    const-string v1, "onLocaleSettingsChanged"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-static {v0, v1, v2, v3, v2}, Lgc/c;->u(Lgc/c;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lzc/g$a;->a:Lzc/g;

    .line 11
    .line 12
    const-string v1, "onCalendarSettingsChanged"

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3, v2}, Lgc/c;->u(Lgc/c;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzc/g$a;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
