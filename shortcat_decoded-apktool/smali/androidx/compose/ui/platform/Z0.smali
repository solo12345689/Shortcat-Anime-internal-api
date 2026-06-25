.class public final Landroidx/compose/ui/platform/Z0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/F1;


# instance fields
.field private a:Lie/a;

.field private b:LY/C0;

.field private final c:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-static {v0, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Landroidx/compose/ui/platform/Z0;->c:LY/C0;

    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic b(Landroidx/compose/ui/platform/Z0;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/Z0;->b:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/Z0;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public c(I)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/G1;->a:Landroidx/compose/ui/platform/G1$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/G1$a;->a()LY/C0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, LE0/P;->a(I)LE0/P;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/Z0;->b:LY/C0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/platform/Z0;->a:Lie/a;

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/Z0;->c:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
