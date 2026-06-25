.class public final Ly2/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lw2/y;

.field private final b:Ldg/e$a;

.field private c:Ljava/lang/String;

.field private d:Lw2/F;

.field private e:Ldg/d;

.field private f:LO9/o;


# direct methods
.method public constructor <init>(Ldg/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly2/a$b;->b:Ldg/e$a;

    .line 5
    .line 6
    new-instance p1, Lw2/y;

    .line 7
    .line 8
    invoke-direct {p1}, Lw2/y;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ly2/a$b;->a:Lw2/y;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lw2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly2/a$b;->b()Ly2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Ly2/a;
    .locals 7

    .line 1
    new-instance v0, Ly2/a;

    .line 2
    .line 3
    iget-object v1, p0, Ly2/a$b;->b:Ldg/e$a;

    .line 4
    .line 5
    iget-object v2, p0, Ly2/a$b;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Ly2/a$b;->e:Ldg/d;

    .line 8
    .line 9
    iget-object v4, p0, Ly2/a$b;->a:Lw2/y;

    .line 10
    .line 11
    iget-object v5, p0, Ly2/a$b;->f:LO9/o;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-direct/range {v0 .. v6}, Ly2/a;-><init>(Ldg/e$a;Ljava/lang/String;Ldg/d;Lw2/y;LO9/o;Ly2/a$a;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ly2/a$b;->d:Lw2/F;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lw2/b;->i(Lw2/F;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0
.end method

.method public final c(Ljava/util/Map;)Ly2/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/a$b;->a:Lw2/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw2/y;->a(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Ljava/lang/String;)Ly2/a$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/a$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
