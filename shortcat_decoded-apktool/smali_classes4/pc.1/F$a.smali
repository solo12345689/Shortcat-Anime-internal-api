.class final synthetic Lpc/F$a;
.super Lkotlin/jvm/internal/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/F;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lpc/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpc/F$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lpc/F$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpc/F$a;->a:Lpc/F$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v2, Loc/f;

    .line 6
    .line 7
    const-string v3, "<init>"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lpc/F$a;->j(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Loc/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final j(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Loc/f;
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Loc/f;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Loc/f;-><init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
