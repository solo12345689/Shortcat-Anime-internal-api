.class public final synthetic La1/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La1/i;

.field public final synthetic b:La1/l;


# direct methods
.method public synthetic constructor <init>(La1/i;La1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La1/k;->a:La1/i;

    .line 5
    .line 6
    iput-object p2, p0, La1/k;->b:La1/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La1/k;->a:La1/i;

    .line 2
    .line 3
    iget-object v1, p0, La1/k;->b:La1/l;

    .line 4
    .line 5
    check-cast p1, La1/i;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, La1/l;->a(La1/i;La1/l;La1/i;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
