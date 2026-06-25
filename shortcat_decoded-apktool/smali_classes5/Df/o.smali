.class public final synthetic LDf/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:LDf/p;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LDf/p;Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LDf/o;->a:LDf/p;

    .line 5
    .line 6
    iput-object p2, p0, LDf/o;->b:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput p3, p0, LDf/o;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LDf/o;->a:LDf/p;

    .line 2
    .line 3
    iget-object v1, p0, LDf/o;->b:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget v2, p0, LDf/o;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LDf/p;->a(LDf/p;Ljava/lang/CharSequence;I)LDf/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
