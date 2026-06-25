.class public final synthetic LM2/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/t;


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:Lw2/g$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Lw2/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/o;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, LM2/o;->b:Lw2/g$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/o;->a:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, LM2/o;->b:Lw2/g$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LM2/r$a;->d(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
