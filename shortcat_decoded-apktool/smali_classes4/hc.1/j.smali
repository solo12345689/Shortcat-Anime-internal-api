.class public final synthetic Lhc/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/JNIFunctionBody;


# instance fields
.field public final synthetic a:Lhc/k;

.field public final synthetic b:LUb/d;


# direct methods
.method public synthetic constructor <init>(Lhc/k;LUb/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhc/j;->a:Lhc/k;

    .line 5
    .line 6
    iput-object p2, p0, Lhc/j;->b:LUb/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lhc/j;->a:Lhc/k;

    .line 2
    .line 3
    iget-object v1, p0, Lhc/j;->b:LUb/d;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lhc/k;->b(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
