.class public final Lx4/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx4/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lx4/l;

.field private final b:LPf/h;


# direct methods
.method public constructor <init>(ILx4/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lx4/d$c;->a:Lx4/l;

    .line 5
    .line 6
    const/4 p2, 0x2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v1, p2, v0}, LPf/l;->b(IIILjava/lang/Object;)LPf/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lx4/d$c;->b:LPf/h;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(LA4/m;LG4/m;Lv4/d;)Lx4/i;
    .locals 2

    .line 1
    new-instance p3, Lx4/d;

    .line 2
    .line 3
    invoke-virtual {p1}, LA4/m;->b()Lx4/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lx4/d$c;->b:LPf/h;

    .line 8
    .line 9
    iget-object v1, p0, Lx4/d$c;->a:Lx4/l;

    .line 10
    .line 11
    invoke-direct {p3, p1, p2, v0, v1}, Lx4/d;-><init>(Lx4/p;LG4/m;LPf/h;Lx4/l;)V

    .line 12
    .line 13
    .line 14
    return-object p3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lx4/d$c;

    .line 2
    .line 3
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    const-class v0, Lx4/d$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
